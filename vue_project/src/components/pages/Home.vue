<template>
  <div class="home">
    <MyHeader class="myheader"/>
    <div v-if="isSidebar() === true" @click="changeSidebar()" class="fadeLayer"></div>
  </div>
</template>

<script>

import MyHeader from "@/components/modules/MyHeader.vue"

import {mapMutations} from 'vuex'

export default {
  name: "Home",
  components: {
    MyHeader,
  },
  data() {
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
.myheader{
  position: fixed;
  width: 100%;
  z-index: 2;
}
.fadeLayer{
  position: fixed;
  top: 0px;
  left: 0px;
  width: 100%;
  height: 100%;
  background-color: #000000;
  opacity: 0.5;
  z-index: 1;
}
.first-element{
  /* MyHeaderの大きさによって変わるので注意 */
  margin-top: 150px;
}

</style>