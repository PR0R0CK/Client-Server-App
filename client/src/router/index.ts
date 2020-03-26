import Vue from "vue";
import VueRouter from "vue-router";
import Home from "@/views/Home.vue";
import Pizza from "@/views/Pizza.vue";
import BadGateway from "@/views/BadGateway.vue";
import News from "@/views/News.vue";
import Sets from "@/views/Sets.vue";

Vue.use(VueRouter);
const routes = [
  {
    path: "/",
    name: "home",
    props: { page: 0 },
    component: Home
  },
  {
    path: "/pizza",
    name: "pizza",
    props: { page: 1 },
    component: Pizza
  },
  {
    path: "/zestawy",
    name: "zestawy",
    props: { page: 2 },    
    component: () => import("../views/Sets.vue")
    // component: Sets
  },
  {
    path: "/nowości",
    name: "news",
    props: { page: 3 },
    component: () => import("../views/News.vue")
    // component: News
  },
  {
    path: "/404",
    name: "BadGateway",
    props: { page: 4 },
    component: BadGateway
  },
  {
    path: "*",
    props: { page: 5 },
    redirect: "/404"
  },
  {
    path: "/Marcin",
    name: "about",
    props: { page: 6 },
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/About.vue")
  }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
