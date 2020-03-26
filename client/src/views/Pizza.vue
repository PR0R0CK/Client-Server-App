<template>
  <section id="dashboard">
    <div id="pizza" m-auto>
      <products request="/products/pizza"/>  
    </div>
  </section>
</template>

<script> 
import Products from "@/components/Products.vue";

export default {
  name: "pizza",
  components: {
    Products
  },
  created: function() {
    var apiUrl = document.getElementById("serverApi").value;
    var apiV   = "";
    this.apiUrl = apiUrl;
    if (  document.getElementById("apiV1").checked === true) {
     apiV = "api/v1";
    }
  
    axios
    .get( apiUrl + apiV + "/products/pizza/news" )
    .then(res => {
      this.pizzas = res.data;
    });
  },
  methods:  {
    formatPrice(value) {
      let val = (value / 1).toFixed(2).replace(".", ",");
      return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
    },
    add2basket( id, val ) {
      store.state.count = store.state.count+val;
      if ( store.state.id == "" )
        store.state.id = id;
      else
        store.state.id = store.state.id+", "+id;
    }
  }
};
</script>

