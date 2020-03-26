package com.pizza.app.service.impl;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.pizza.app.controller.ProductController;
import com.pizza.app.domain.dto.CalculateOrderDto;
import com.pizza.app.domain.dto.OrderDto;
import com.pizza.app.domain.dto.ProductDto;
import com.pizza.app.service.OrderService;
import com.pizza.app.service.ReceiptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ReceiptServiceImpl implements ReceiptService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Override
    public void makeReceipt(CalculateOrderDto calculateOrderDto) {
        Document document = new Document(PageSize.A5);

        try
        {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:\\Programy\\Dev Java\\pizzaapp\\server\\src\\main\\webapp\\WEB-INF\\receipts\\PARAGON.pdf"));
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm");
            Image imgCompany = Image.getInstance("E:\\Programy\\Dev Java\\pizzaapp\\server\\src\\main\\webapp\\WEB-INF\\images\\comp.png");
            Paragraph dashElement = new Paragraph("----------------------------------------------------------------");
            Paragraph dateElement = new Paragraph(sdf.format(date));
            Paragraph receiptCallElement = new Paragraph("========== P A R A G O N ==========");
            Paragraph priceElement = new Paragraph(calculateOrderDto.stringPrice());

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            float[] columnWidths = {1f, 1f};
            table.setWidths(columnWidths);

            for (ProductDto productDto:calculateOrderDto.getProducts()) {
                PdfPCell productCell = new PdfPCell(new Paragraph(productDto.getName()));
                productCell.setBorderColor(BaseColor.BLACK);
                productCell.setPaddingLeft(10);
                productCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                productCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                Integer productPrice = productDto.getPrice()/100;
                PdfPCell priceCell = new PdfPCell(new Paragraph(productPrice.toString() + " PLN"));
                priceCell.setBorderColor(BaseColor.BLACK);
                priceCell.setPaddingLeft(10);
                priceCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                priceCell.setVerticalAlignment(Element.ALIGN_MIDDLE);

                table.addCell(productCell);
                table.addCell(priceCell);
            }


            imgCompany.setAlignment(Element.ALIGN_CENTER);
            dashElement.setAlignment(Element.ALIGN_CENTER);
            receiptCallElement.setAlignment(Element.ALIGN_CENTER);
            priceElement.setAlignment(Element.ALIGN_RIGHT);

            document.open();



            document.add(imgCompany);

            document.add(receiptCallElement);
            document.add(Chunk.NEWLINE);
            document.add(dateElement/*,new Phrase(FontFactory.getFont(FontFactory.TIMES_BOLD,5.5f))*/);
            document.add(Chunk.NEWLINE);
            document.add(table);
            document.add(Chunk.NEWLINE);
            document.add(priceElement);

            document.close();
            writer.close();

            LOGGER.info("### Receipt has been generated!");
            LOGGER.info(sdf.format(date));
        } catch (DocumentException | IOException e)
        {
            e.printStackTrace();
        }
    }
}
