import Vue from 'vue'
import App from './App.vue'
import axios from 'axios' 
import VueAxios from 'vue-axios' 

Vue.config.productionTip = false
Vue.use(VueAxios, axios) 

import router from '@/router.js';
import store from '@/store.js';

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')

