<template>
  <div class="sidebar">
    <div class="sidebar-wrapper">
      <div class="sidebar-link-area late">
        <!-- サイドバーメニュー -->
        <h2>メニュー</h2>
      </div>
    </div>
  </div>
</template>

<script>

import {mapMutations} from 'vuex'
export default {
  name: "Sidebar",
  data(){
  },
  methods: {
    ...mapMutations(["changeSidebar"]),
  } 
}
</script>

<style scoped>
.sidebar {
  background-color: #ffffff;
  height: 100%; /* サイドバーの高さ */
  width: 500px; /* サイドバーのwidthを指定 */
  opacity: 0.95; /* 透過する 0に近くほど透過する */
  position: fixed; /* 左上に要素を固定する(スクロールしても位置は固定される) */
  overflow-x: hidden; /* 横軸ではみ出た要素を非表示にする */
  box-sizing: border-box; /* paddingとborderを、widthとheightに含める */
  padding-left: 40px; /* サイドバー内のリンクの位置を右にずらす */
  z-index: 2;
}
.sidebar-link-area {
  padding-top: 20px; /* サイドバーリンクの上部に空白を作る */
}
.late{
  opacity: 0;
  animation: appear 0s ease 0.5s 1 normal forwards running;
}
.campaignBox{
  padding: 1em;
  width: 80%;
  border: 2px solid #ec6d88; /*線の太さ・色*/
  background-color: #fff; /*背景色*/
  box-shadow: -2px 5px 5px #e8d3c7; /*影*/
  border-radius: 20px; /*角の丸み*/
}
.sidebar-link {
  color: #ec6d88; /* リンクの文字色を白に */
  cursor: pointer;
}
.sidebar-link:hover {
  color: #470000 /* マウスがリンクに乗った時も文字色を白に */
}
@keyframes appear {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
</style>