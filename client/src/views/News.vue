<template>
  <div>
   <products request="/products/pizza/news"/>  
  </div>
</template>

<script>
import Products from "../components/Products.vue";

export default {
  name: "news",
  components: {
    Products
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
