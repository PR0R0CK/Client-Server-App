<template>
  <div class="container animated fadeIn">
    <NoConnectedInfo
      v-if="products == null"
      msg="Spróbuj ponownie później, Miłego dnia!"
    />
    <section class="card-deck">
      <CardC
        v-for="product in products"
        v-bind:key="product.id"
        :id="product.id"
        :type="product.type"
        :price="product.price"
        :size="product.size"
        :name="product.name"
        :desc="product.desc"
        :img="product.img"
        :apiUrl="apiUrl"
      />
    </section>
  </div>
</template>

<script lang="ts">
import axios from "axios";
import store from "@/store";
import CardC from "@/components/CardC.vue";
import NoConnectedInfo from "@/components/NoConnectedInfo.vue";
import { Component, Prop, Vue } from "vue-property-decorator";

@Component({
  template: require("@/components/CardC.vue"),
  components: {
    CardC,
    NoConnectedInfo
  }
})
export default class Products extends Vue {
  @Prop() private request!: string;
  @Prop() private products!: any;
/* eslint-disable */
  mounted() {
    var apiUrl: string = document.getElementById("serverApi").value;
    var apiVer = "";
// eslint-disable-next-line
    this.apiUrl = apiUrl;
    // eslint-disable-next-line
    if (document.getElementById("apiV1").checked === true) {
      apiVer = "api/v1";
    }

    axios.get(apiUrl + apiVer + this.request).then(res => {
      this.products = res.data;
    });
  }

  formatPrice(value:number) {
    let val = (value / 1).toFixed(2).replace(".", ",");
    return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
  }

  add2basket(id:string, val:number) {
    store.state.count = store.state.count + val;
    if (store.state.id == '') store.state.id = id;
    else store.state.id = store.state.id + ", " + id;
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
