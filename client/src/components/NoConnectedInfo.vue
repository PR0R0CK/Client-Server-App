<template>      
  <div class="m-auto">
    <h1 class=" text-center animated fadeIn">
      <p>  Upewnij się że masz połączenie z serwerem </p>
        <h3>{{ msg }}</h3>
    </h1>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from "vue-property-decorator";

@Component
export default class NoConnectedInfo extends Vue {
  @Prop() private msg!: string;
}
</script>
