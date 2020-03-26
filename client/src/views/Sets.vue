<template>
  <section>
    <products request="/products/pizza/sets"/>  
    <!-- <sets /> -->
  </section>
</template>

<script>
// import Sets from '@/components/Sets.vue';

import Products from "@/components/Products.vue";
export default {
  name: "sets",
  components: {
    Products
  }
};
</script>

<style scoped>
.profile-card-footer {
  background-color: #f7f7f7 !important;
  padding: 1.25rem;
}
.card.card-cascade .view {
  box-shadow: 0 3px 10px 0 rgba(0, 0, 0, 0.15), 0 3px 12px 0 rgba(0, 0, 0, 0.15);
}
</style>
