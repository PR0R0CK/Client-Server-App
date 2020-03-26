import Vue from "vue";
import App from "./App.vue";
import "./registerServiceWorker";
import router from "./router";
import store from "./store";
import 'bootstrap-css-only/css/bootstrap.min.css';
import 'mdbvue/lib/css/mdb.min.css';
import 'axios';
// import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import "bootstrap-css-only/css/bootstrap.min.css";
import "mdbvue/lib/css/mdb.min.css";

// import VuePlyr from 'vue-plyr';
// import VuePlyr from './../../dist/js/demo.min.js';

// import '@fortawesome/vue-fontawesome'

// Vue.component('font-awesome-icon', FontAwesomeIcon)

Vue.config.productionTip = false;

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount("#app");

// Vue.use(VuePlyr, {
//   plyr: {
//     fullscreen: { enabled: false }
//   },
//   emit: ['ended']
// })