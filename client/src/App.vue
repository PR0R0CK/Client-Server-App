<template>
  <div class="content">
     <mdb-navbar class="navbar white" light position="top" scrolling>
        <router-link to="/" @click.native="activeItem = 0" class="d-inline">
      <!-- <a class="logo-wrapper d-inline"> -->
          <img 
            alt
            class=" max-width-img "
            :class="activeItem !== 0 && 'diss'"
            src="./assets/ki_logo.jpg"
          />
      <!-- </a> -->
       <!-- <a class="logo-wrapper mr-auto"> -->
      <!-- <mdb-navbar-brand href="https://mdbootstrap.com/docs/vue/" target="_blank"> -->
         <img
            alt
            class="  mx-4 max-height-img"
            src="./assets/logoCD.png"
          />
          <!-- </mdb-navbar-brand> -->
          <!-- </a> -->
        </router-link>
      <mdb-navbar-toggler>
        <mdb-navbar-nav left class="animated fadeIn ml-1">

          <router-link to="/pizza" @click.native="activeItem = 1">
            <mdb-nav-item
              :action="true"
              :class="activeItem === 1 && 'active'"
              waves-fixed
              >Oferta
            </mdb-nav-item>
          </router-link>

          <router-link to="/zestawy" @click.native="activeItem = 2">
            <mdb-nav-item
              :action="true"
              :class="activeItem === 2 && 'active'"
              waves-fixed
              >Zestawy
            </mdb-nav-item>
          </router-link>

          <router-link to="/nowości" @click.native="activeItem = 3">
            <mdb-nav-item
              :action="true"
              :class="activeItem === 3 && 'active'"
              waves-fixed
              >Nowości
            </mdb-nav-item>
          </router-link>     
<!-- 
          <router-link to="/Marcin" @click.native="activeItem = 4" >
            <mdb-nav-item
              :action="true"
              :class="activeItem === 4 && 'active'"
              waves-fixed
              >Test
            </mdb-nav-item>
          </router-link>      -->
        </mdb-navbar-nav>

        <mdb-navbar-nav right class="animated fadeIn m-0 p-0">
          <mdb-nav-item waves-fixed >
            <Basket  class="m-0 p-0"/>
          </mdb-nav-item>

          <!-- <mdb-nav-item href="#!" waves-fixed>
            <mdb-icon fab icon="twitter" />
          </mdb-nav-item> -->
          <!-- <mdb-nav-item
            href="https://bitbucket.org/pala_to_pala/pizzaapp/src/master/"
            waves-fixed
            class="border border-light rounded mr-1"
            target="_blank"
          >
             <mdb-icon fab icon="github" class="mr-2" />    PizzaApp 
          </mdb-nav-item> -->
        </mdb-navbar-nav>
      </mdb-navbar-toggler>
    </mdb-navbar>
    <!-- /.Navbar-->
    <main>
      <!-- https://www.youtube.com/embed/0tqpnTM8jSs?autoplay=1&amp;origin=http://195.154.45.91:8081&amp;iv_load_policy=3&amp;modestbranding=1&amp;playsinline=1&amp;showinfo=0&amp;rel=0&amp;enablejsapi=1 -->
               <!-- src="https://www.youtube.com/embed/0tqpnTM8jSs?autoplay=1" -->
         <iframe width="70" height="50" id="myFrame" class="pt-6"  
         :action="true"
              :class="activeItem !== 0 && 'diss diss-height'"
               src="https://player.vimeo.com/video/117288258?color=ffffff&amp;portrait=0&amp;autoplay=1"
     frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
      allowfullscreen></iframe>

        <router-view class="mt-5 p-5 min-main-width"></router-view>
      
      <ftr color="primary-color-dark" class="text-center font-small darken-2">
        <div class="pt-4">
          <mdb-btn
            outline="white"
            tag="a"
            href="https://bitbucket.org/pala_to_pala/pizzaapp/src/master/"
            target="_blank"
          >
            PizzaApp
            <mdb-icon icon="download" class="ml-2" />
          </mdb-btn>

          <mdb-btn
            outline="white"
            tag="a"
            href="https://mdbootstrap.com/docs/vue/getting-started/download/"
            target="_blank"
          >
            Start free tutorial
            <mdb-icon icon="graduation-cap" class="ml-2" />
          </mdb-btn>
        </div>
        <hr class="my4" />

        <input-api class="w-50 m-auto mt-4 " />

        <hr class="my-4" />
        <div class="pb-4">
        </div>
        <p class="footer-copyright mb-0 py-3 text-center">
          &copy; 2020 Copyright:
          <!-- <a href="https://bitbucket.org/%7B435329eb-317a-47a1-93e8-3e4eb2d56e51%7D/">P.A.Ł.A</a> -->
          <a
            href="https://bitbucket.org/%7B435329eb-317a-47a1-93e8-3e4eb2d56e51%7D/"
            >P.A.Ł.A</a
          >
        </p>
      </ftr>
    </main>
  </div>
</template>

<script>
import {
  // mdbContainer,
  mdbNavbar,
  // mdbNavbarBrand,
  mdbNavItem,
  mdbNavbarNav,
  mdbNavbarToggler,
  mdbBtn,
  mdbIcon,
  // mdbListGroup,
  // mdbListGroupItem,
  // mdbCardBody,
  mdbFooter,
  waves
} from "mdbvue";

// import Dashboard from './components/Dashboard'
import Basket from "./components/Basket";
import InputApi from "./components/InputApi.vue";

export default {
  name: "Main",
  components: {
    // mdbContainer,
    mdbNavbar,
    // mdbNavbarBrand,
    mdbNavItem,
    mdbNavbarNav,
    mdbNavbarToggler,
    mdbBtn,
    // mdbListGroup,
    // mdbListGroupItem,
    mdbIcon,
    // mdbCardBody,
    ftr: mdbFooter,
    // Dashboard
    Basket,
    // Users
    InputApi
  },
  data() {
    return {
      activeItem: 0
    };
  },
  beforeMount() {
    // this.activeItem = this.$route.matched[0].props.default.page;
  },
  mixins: [waves]
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
main {
  background-color: #ededee;
}

.flexible-content {
  transition: padding-left 0.3s;
  padding-left: 270px;
}

.flexible-navbar {
  transition: padding-left 0.5s;
  padding-left: 270px;
}

.sidebar-fixed {
  left: 0;
  top: 0;
  height: 100vh;
  width: 270px;
  box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
  z-index: 1050;
  background-color: #fff;
  padding: 1.5rem;
  padding-top: 0;
}

.sidebar-fixed .logo-wrapper img {
  width: 100%;
  padding: 2.5rem;
}

.sidebar-fixed .list-group-item {
  display: block !important;
  transition: background-color 0.3s;
}

.sidebar-fixed .list-group .active {
  box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
  border-radius: 5px;
}

@media (max-width: 1199.98px) {
  .sidebar-fixed {
    display: none;
  }
  .flexible-content {
    padding-left: 0;
  }
  .flexible-navbar {
    padding-left: 10px;
  }
}

.navbar-light .navbar-brand {
  margin-left: 15px;
  color: #2196f3 !important;
  font-weight: bolder;
}

.max-width-img {
  max-width: 41px;  
  max-height: auto;
  transition: max-width 1s;
}

.max-height-img
{
  max-height: 42px;  
}
.diss{
  max-width: 0px;  
  transition: max-width 2s;
}

.diss-height{
  max-height: 0px;
  height: 0px;
}

.min-main-width{
  /* min-height: 1000px; */
  height: auto;
  transition: height 2s;
  /* min-height: 100%; */
}
 
.pt-6{
  /* margin-top: 70px; */
  /* position: relative; */
  /* top:60; */
}
</style>
