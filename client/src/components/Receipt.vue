<template>
    <section class="text-center m-auto">
      <mdb-row>          {{ msg }}                
          <mdb-col md="8" class="mb-4 m-auto">
              <mdb-card>
                  <mdb-card-body>
                      <mdb-tbl hover>
                          <thead class="blue lighten-4">
                              <tr>
                                  <th>Lp</th>                                  
                                  <th>Nazwa</th>
                                  <th>Rozmiar</th>
                                  <th>Cena</th>
                              </tr>
                          </thead>
                          <tbody >
                              <tr  v-for="(product,itemObjKey) in receipt.products" v-bind:key="product.id">
                                  <th scope="row">{{ itemObjKey + 1  }}</th>
                                  <td>{{ product.name }}</td>
                                  <td v-if="product.type == 'drink'">{{ product.size }} ml</td>                                  
                                  <td v-else>{{ product.size }} cm</td>
                                  <td>{{ formatPrice(product.price) }}</td>
                              </tr>   
                                <tr>
                                  <th></th>
                                  <th></th>
                                  <th> <b>Suma</b></th>
                                  <th><b>{{ formatPrice(receipt.totalPrice)}} PLN</b></th>
                              </tr>
                          </tbody>
                      </mdb-tbl>
                  </mdb-card-body>
              </mdb-card>
          </mdb-col>
      </mdb-row>
    </section>   
</template>


<script>
import axios from 'axios';

import store from '@/store';
import { mdbRow, mdbCol, mdbTbl, mdbCard, mdbCardBody } from "mdbvue";
export default {
    name: "Receipt",
    components: {
        mdbRow,
        mdbCol,   
        mdbTbl,
        mdbCard,
        mdbCardBody,
    }, 
    data() {
    return {
      receipt: null,
      msg:null
     };
    },
    created: function () {
         const url = document.getElementById("serverApi").value;
        let headers = { "Content-Type": "application/json;charset=utf-8" };
        let map =  JSON.stringify(store.state.id);
        const json = { productIds:  store.state.id  };
        // Komentarz pozostawiony by prześledić jak znaleziono rozwiązanie :)
        //  const json1 = {  productIds: [ 1,5,8 ] };
        // console.warn(json1);
        // console.warn(1);
        // console.warn(json);
        // console.warn(2);
      axios
        .post(url + "api/v1/order", json , headers)
        .catch(function(error) {
          if (error.response) {
            console.log(error.response.data); 
            console.log(error.response.status);
            console.log(error.response.headers);
          }
        })
        .then(res => {
          this.receipt = res.data;     
        });
    },
    methods: {

    async sendBasket() {   alert(3)
      //   const url = document.getElementById("serverApi").value;
      //   let headers = { "Content-Type": "application/json;charset=utf-8" };
      //   const json = { productIds: [3] };

      // axios
      //   .post(url + "api/v1/order", {
      //       productIds: [ 1 ]
      //       // productIds: "[" + store.state.id + "]"
      //     }, headers)
      //   .then(res => {
      //     this.receipt = res.data;
     
      //   });
    },  
    formatPrice(value) {
      let val = (value / 100).toFixed(2).replace(".", ",");
      return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
    }
  }
}
</script>
