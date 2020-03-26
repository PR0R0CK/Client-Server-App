<template>
  <div class="about">
      <products request="/products/get-sauces"  img="product.img"/> 
  </div>
</template>

<script>

import Products from "@/components/Products.vue";

export default {
  name: "Marcin",
  components: {
    Products
  }
};
</script>