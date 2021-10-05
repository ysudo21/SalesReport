import Vue from "vue"
import VueRouter from "vue-router"

import Home from '@/components/pages/Home.vue'

Vue.use(VueRouter)

const router = new VueRouter({
    mode: 'history',
    routes: [
        {path: '/', redirect: {name: 'Home'}},
        {path: '/home', name: 'Home', component: Home},
    ],
    scrollBehavior(){
        return {x:0,y:0}
    }
});

export default router;