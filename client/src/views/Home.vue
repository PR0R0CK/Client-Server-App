<template> 
  <div class="home text-center">
    <a href="https://www.youtube.com/watch?v=0tqpnTM8jSs" target="_blank">
    <img alt="Vue logo" src="../assets/logo.png" />
    </a>
    <HelloWorld msg="Welcome to Your Vue.js App" />
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from "@/components/HelloWorld.vue";
export default {
  name: "home",
  components: {
    HelloWorld
  }
};
</script>


