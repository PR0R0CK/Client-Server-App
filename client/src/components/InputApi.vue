<template>
 <section>
  <mdb-input
    mdbInput
    type="text"
    label="Server Api"
    id="serverApi"
    ref="serverApi"
    value="http://127.0.0.1:8080/"
  />
    <!-- value="http://192.168.76.213:8080/" -->
    <!-- value="http://192.168.76.213:8080/" -->
  <!-- Default checked -->
  <div class="custom-control custom-switch text-gray"  >
    <input type="checkbox" class="custom-control-input" id="apiV1" checked>
    <label class="custom-control-label" for="apiV1">/api/v1 </label>
  </div>
 </section>
</template>

<script>
import { mdbInput } from "mdbvue";

export default {
  name: "InputsPage",
  components: {
    mdbInput
  },
  methods: {
    myFunctionClick: function() {
      this.$refs.serverApi.value = "Hello Bro";
    }
  }
};
</script>

<style>
#serverApi:hover {
  color: gray !important;
}
/* input[type=text]{
  color: white !important;
} */

/* .md-form input
{
  color: rgb(154, 219, 219); 
} */
/* .md-form input[type=text]:focus {

box-shadow: 0 1px 0 0 green !important;

border-bottom: 1px solid green !important;

} */
/* input {
  -webkit-animation-name: autofill;
  animation-name: autofill;
  -webkit-animation-fill-mode: both;
  animation-fill-mode: both; } */
</style>
