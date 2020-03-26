<template>
<main>
    <!-- <iframe width="766" height="431" id="myFrame" class="m-auto p-auto" src="https://www.youtube.com/embed/0tqpnTM8jSs"
     frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
      allowfullscreen></iframe> -->
  <!-- <iframe id="player" type="text/html" width="640" height="360"
  src="http://www.youtube.com/embed/M7lc1UVf-VE?enablejsapi=1&origin=http://example.com"
  frameborder="0"></iframe> -->
  
    <div class="hello">
  
    <h1>{{ msg }}</h1>
    <p>
      For a guide and recipes on how to configure / customize this project,<br />
      check out the
      <a href="https://cli.vuejs.org" target="_blank" rel="noopener"
        >vue-cli documentation</a
      >.
    </p>
    <h3>Installed CLI Plugins</h3>
    <ul>
      <li>
        <a
          href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-babel"
          target="_blank"
          rel="noopener"
          >babel</a
        >
      </li>
      <li>
        <a
          href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-typescript"
          target="_blank"
          rel="noopener"
          >typescript</a
        >
      </li>
      <li>
        <a
          href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-pwa"
          target="_blank"
          rel="noopener"
          >pwa</a
        >
      </li>
      <li>
        <a
          href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-router"
          target="_blank"
          rel="noopener"
          >router</a
        >
      </li>
      <li>
        <a
          href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-vuex"
          target="_blank"
          rel="noopener"
          >vuex</a
        >
      </li>
      <li>
        <a
          href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-eslint"
          target="_blank"
          rel="noopener"
          >eslint</a
        >
      </li>
      <li>
        <a
          href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-unit-mocha"
          target="_blank"
          rel="noopener"
          >unit-mocha</a
        >
      </li>
    </ul>
    <h3>Essential Links</h3>
    <ul>
      <li>
        <a href="https://vuejs.org" target="_blank" rel="noopener">Core Docs</a>
      </li>
      <li>
        <a href="https://forum.vuejs.org" target="_blank" rel="noopener"
          >Forum</a
        >
      </li>
      <li>
        <a href="https://chat.vuejs.org" target="_blank" rel="noopener"
          >Community Chat</a
        >
      </li>
      <li>
        <a href="https://twitter.com/vuejs" target="_blank" rel="noopener"
          >Twitter</a
        >
      </li>
      <li>
        <a href="https://news.vuejs.org" target="_blank" rel="noopener">News</a>
      </li>
    </ul>
    <h3>Ecosystem</h3>
    <ul>
      <li>
        <a href="https://router.vuejs.org" target="_blank" rel="noopener"
          >vue-router</a
        >
      </li>
      <li>
        <a href="https://vuex.vuejs.org" target="_blank" rel="noopener">vuex</a>
      </li>
      <li>
        <a
          href="https://github.com/vuejs/vue-devtools#vue-devtools"
          target="_blank"
          rel="noopener"
          >vue-devtools</a
        >
      </li>
      <li>
        <a href="https://vue-loader.vuejs.org" target="_blank" rel="noopener"
          >vue-loader</a
        >
      </li>
      <li>
        <a
          href="https://github.com/vuejs/awesome-vue"
          target="_blank"
          rel="noopener"
          >awesome-vue</a
        >
      </li>
    </ul>
  </div>
  <div id="player"></div>
  </main>
</template>

<script lang="ts">
  

import { Component, Prop, Vue } from "vue-property-decorator";
// Vue.loadScript("https://cdn.plyr.io/3.5.6/plyr.js")
// import Plyr from '@/components/Plyr.vue';
// import Plyr from 'plyr';
// const player = new Plyr(document.getElementById('player'));
// <link rel="stylesheet" href="" />

@Component
export default class HelloWorld extends Vue {
  @Prop() private msg!: string;
   mounted() {

      const canvas:(HTMLElement|any) = document!.getElementById("myFrame");

      if (isIframe(canvas)) {
          canvas.height =  window.innerHeight;
          canvas.width = window.innerWidth-15;
      }

      function isIframe(obj: HTMLCanvasElement | HTMLElement): obj is HTMLCanvasElement {
          return obj.tagName === 'IFRAME';
      }
     
      // document!.getElementById("myFrame").height = window.innerHeight;
    //  var url =document.getElementById("myFrame").getAttribute("src");
    //   var newUrl = url.substring(0,url.indexOf("width")) + "width=500&height=500";
    //   document.getElementById("myFrame").setAttribute("src",newUrl);

      let recaptchaScript = document.createElement('script')
      recaptchaScript.setAttribute('src', 'https://unpkg.com/vue')
      // document.head.appendChild(recaptchaScript)

      let rs2 = document.createElement('script')
      rs2.setAttribute('src', 'https://unpkg.com/plyr')
      // document.head.appendChild(rs2)

      let rs3 = document.createElement('script')
      rs3.setAttribute('src', 'https://unpkg.com/vue-plyr')
      // document.head.appendChild(rs3)

      let css = document.createElement('link')
      css.setAttribute('href', 'https://cdn.plyr.io/3.5.6/plyr.css') 
      document.head.appendChild(css)
  }
  // created() {
  //   window.addEventListener("resize", this.myEventHandler);
  // }
// destroyed() {
//   window.removeEventListener("resize", this.myEventHandler);
// }
// methods: {
//   myEventHandler(e) {
//     alert(3)
//     // your code for handling resize...
//   }
// }
}

// const player = new Plyr('#player', {
//   debug: true,
//   volume: 0,
//   autoplay: true
// })
// Temporary Fix
// player.on('ready', event => {
//   player.play()
// })  // 2. This code loads the IFrame Player API code asynchronously.
      // var tag = document.createElement('script');

      // tag.src = "https://www.youtube.com/iframe_api";
      // var firstScriptTag = document.getElementsByTagName('script')[0];
      // firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

      // // 3. This function creates an <iframe> (and YouTube player)
      // //    after the API code downloads.
      // var player;
      // function onYouTubeIframeAPIReady() {
      //   player = new YT.Player('player', {
      //     height: '360',
      //     width: '640',
      //     videoId: 'M7lc1UVf-VE',
      //     events: {
      //       'onReady': onPlayerReady,
      //       'onStateChange': onPlayerStateChange
      //     }
      //   });
      // }

      // // 4. The API will call this function when the video player is ready.
      // function onPlayerReady(event) {
      //   event.target.playVideo();
      // }

      // // 5. The API calls this function when the player's state changes.
      // //    The function indicates that when playing a video (state=1),
      // //    the player should play for six seconds and then stop.
      // var done = false;
      // function onPlayerStateChange(event) {
      //   if (event.data == YT.PlayerState.PLAYING && !done) {
      //     setTimeout(stopVideo, 6000);
      //     done = true;
      //   }
      // }
      // function stopVideo() {
      //   player.stopVideo();
      // }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
iframe{
  /* position: fixed; */
  top:50;
  left: 0;
}
</style>
