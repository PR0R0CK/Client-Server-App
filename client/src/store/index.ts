import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    count: 0,
    id: []
  },
  mutations: {
    increment (state, payload){
      return state.count = state.count + payload.amount;
    },
    decrement (state, payload){
      return state.count = state.count - payload.amount;
    }
  },
  actions: {
    increment (context, payload) {
      context.commit('increment', payload)
    },
    decrement (context, payload) {
      context.commit('decrement', payload)
    }
  },
  modules: {}
});
