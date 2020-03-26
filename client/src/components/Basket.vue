<template>
  <section >
 
    <mdb-btn
      id="btn-baset"
      @click="sendBasket"
      size="sm"
      @click.native="showFluidModalBottom = true"
      class="grey lighten-1" 
    >
        <span>Koszyk <span id="price"> {{ formatPrice( $store.state.count) }} </span> PLN </span>
      <!-- <mdb-btn color="primary" size="sm" @click.native="showFluidModalBottom = true">Rachunek</mdb-btn> -->
    </mdb-btn>

    <mdb-modal
      fullHeight
      position="bottom"
      :show="showFluidModalBottom"
      @close="showFluidModalBottom = false"
    >
      <mdb-modal-header>
        <mdb-modal-title ><h4 class="p-3 mt-4 text-center">Rachunek </h4></mdb-modal-title>
      </mdb-modal-header>
      <mdb-modal-body  v-if="basket.products != null">
        <receipt class="pb-4" :msg="basket"/>
      </mdb-modal-body>
      <mdb-modal-body  v-else class="text-center">
        <p> <b>Koszyk jest pusty, dodaj produkty klikając na zdjęcie</b> </p>
      </mdb-modal-body>

      <mdb-modal-footer>
        <mdb-btn color="secondary" @click.native="showFluidModalBottom = false"
          >Anuluj</mdb-btn>
          <a v-if="basket.products != null" v-bind:href="url2pdf()" target="_blank">
            <mdb-btn color="primary" @click.native="showid">Zamów</mdb-btn>
          </a>
      </mdb-modal-footer>
    </mdb-modal>
  </section>
</template>

<script>

import {
  mdbRow,
  mdbCol,
  mdbBtn,
  mdbCard,
  mdbCardBody,
  mdbCardHeader,
  mdbCardText,
  mdbIcon,
  mdbTbl,
  mdbBarChart,
  mdbPieChart,
  mdbLineChart,
  mdbRadarChart,
  mdbDoughnutChart,
  mdbListGroup,
  mdbListGroupItem,
  mdbBadge,
  mdbModal,
  mdbModalHeader,
  mdbModalTitle,
  mdbModalBody,
  mdbModalFooter
} from "mdbvue";

import axios from "axios";
import Receipt from '@/components/Receipt.vue';
// import store from "@/store";
import store from '../store';
import { mapActions } from 'vuex'    

export default {
  components: {
    mdbBtn,
    mdbModal,
    mdbModalFooter,
    Receipt
  },
  name: "Basket",
  data() {
    return {
      price: 0,
      basket: {pdfPath: "http://127.0.0.1:8080/files/PARAGON.pdf"},
      showFluidModalBottom: false,
      urlPdfPath: "http://127.0.0.1:8080/files/PARAGON.pdf",
      IDs: "",
      count: 0
    };
  },
  methods: {
    formatPrice(value) {
      let val = (value / 100).toFixed(2).replace(".", ",");
      return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
    },
    async sendBasket() {
      const url = document.getElementById("serverApi").value;   
      var apiV   = "";
      if (  document.getElementById("apiV1").checked === true) {
        apiV = "api/v1";
      }
      const json = { productIds:  store.state.id  };
      let headers = { "Content-Type": "application/json;charset=utf-8" };
      axios
        .post(
          url + "api/v1/order", 
          json,      
          headers
        )        
        .catch(function(error) {
          if (error.response) {
            console.log(error.response.data);
            console.log(error.response.status);
            console.log(error.response.headers);
          }
        })
        .then(res => {
          this.basket = res.data;          
          urlPdfPath = url+apiV+this.res.data.pdfPath;
        });
    },
    showid() {
      // alert(store.state.id );
      // alert(  this.basket.pdfPath )
      // urlPdfPath = url+apiV+basket.pdfPath;
      // window.open( basket.pdfPath, '_blank');
      router.push("yourroutename")
    },
    url2pdf() {
      const url = document.getElementById("serverApi").value;   
      var apiV   = "";
      if (  document.getElementById("apiV1").checked === true) {
        apiV = "api/v1";
      }
      return url + this.basket.pdfPath;
    }
  }
};
</script>

