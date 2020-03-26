<template>
  <section @click="add2basket(id, price)">
    <div class="my-3 mx-2 card card-cascade wider" style="width: 349px; display: flex;">
      <!-- <button @click="add2basket( id,  price)">-</button> -->
      <div class="view overlay view-cascade">
        <div class="m-auto">
          <img :src="apiUrl + img" alt="Card image cap" class="img-fluid" />
        </div>
        <div
          class="mask flex-center waves waves-effect waves-light rgba-white-slight ripple-parent"
        ></div>
      </div>

      <div class="text-center pb-0 card-body card-body-cascade" style="min-height: 191px;">
        <h4 class="card-title" style="min-height: 1.3em;">
          <strong>{{ name }}</strong>
        </h4>
        <p class="card-text">{{ desc }}</p>
        <span v-if="type == 'drink'">Pojemność: {{ size }} ml</span>
        <span v-else>Średnica: {{ size }} cm</span>
      </div>
      <div class="text-center card-footer">
        <small class="text-muted">{{ formatPrice(price / 100) }} PLN</small>
      </div>
    </div>
  </section>
</template>

<script lang="ts">
import { Component, Prop, Vue } from "vue-property-decorator";
import store from "../store";

@Component
export default class CardC extends Vue {
  @Prop() private id!: string;
  @Prop() private type!: string;
  @Prop() private price!: string;
  @Prop() private size!: string;
  @Prop() private name!: string;
  @Prop() private desc!: string;
  @Prop() private img!: string;
  @Prop() private apiUrl!: string;

  formatPrice(price: number) {
    let val = (price / 1).toFixed(2).replace(".", ",");
    return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
  }

  add2basket(id: string, val: number) {
    store.state.count = store.state.count + val;
    store.state.id.push(id);
    
      var element = document.getElementById("btn-baset");
  element.className = 'btn btn-default btn-sm ripple-parent light-green accent-4';
  // alert(element.className)
  }
}
</script>

<style scoped>
img {
  margin: auto;
}
div > span {
  size: 0.1em;
}
section.preview {
  border: 1px solid #e0e0e0;
  padding: 15px;
}
</style>
