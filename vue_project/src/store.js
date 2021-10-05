import Vue from 'vue';
import Vuex from 'vuex';

import createPersistedState from 'vuex-persistedstate';

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        sidebar: false,
    },
    mutations: {
        changeSidebar(state){
            state.sidebar = !state.sidebar
        },
    },
    getters: {
        sidebar(state){
            return state.sidebar;
        },
    },
    plugins: [createPersistedState({storage: window.sessionStorage})]
});