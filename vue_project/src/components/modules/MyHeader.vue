<template>
  <header>

    <div>
      <transition name="slide">
        <Sidebar v-if="isSidebar() === true" class="sidebar-area"/>
      </transition>
      <div v-if="isSidebar() === true" @click="changeSidebar()" class="fadeLayer"></div>
    </div>

    <div >
      <!-- https://sozai.cman.jp/icon/operation/menu/ -->
      <img @click="changeSidebar()" class="menu" src="../../assets/menubar.png" title="メニュー">
    </div>
   
    <div class="logo">
      真ん中にロゴ
    </div>

  </header>
</template>

<script>
import Sidebar from './Sidebar.vue'
import {mapMutations} from 'vuex';
export default {
  name: "MyHeader",
  components: { 
    Sidebar,
  },
  data(){
    return{
      sidebar: false,
    }
  },
  methods: {
    isSidebar() {
      return this.$store.getters.sidebar;
    },
    ...mapMutations(["changeSidebar"]),
  },
}
</script>

<style scoped>
* {
  box-sizing: border-box;
}
body {
  margin: 0;
  padding: 0;
  font-family: "Hiragino Kaku Gothic Pro", "ヒラギノ角ゴ Pro W3", メイリオ, Meiryo, "ＭＳ Ｐゴシック", "Helvetica Neue", Helvetica, Arial, sans-serif;
  background-color: #e6e6e6;
}
header {
    width: 100%;
    padding: 30px 4% 10px;
    background-color: #fff;
    top: 0;
    display: flex;
}
.sidebar-area {
  float: left;
  top: 0;
  left: 0;
  z-index: 50;
}
.fadeLayer{
  position: absolute;
  top: 0px;
  left: 0px;
  width: 100%;
  height: 100%;
  background-color: #000000;
  opacity: 0.5;
  z-index: 1;
}
.menu {
  margin: 0 auto 0 0;
  cursor: pointer;
  padding-top: 5px;
}
.campaign{
  margin-top: 17px;
  margin-left: 10px;
  font-weight: bold;
  float: right;
}
.logo {
  margin: 0 auto 0 auto;
}
.right{
  float: right;
}

.slide-enter-active{
  /*現れるときのトランジションの状態 */
  animation: slide-in 0.5s;
}
.slide-leave-active{
  /* 消えるときのトランジションの状態*/
  animation: slide-in 0.01s reverse;
}
@keyframes slide-in {
    from{
        width: 0px;
    }
    to{
        width: 500px
    }
}
</style>