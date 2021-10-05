<template>
  <div id="app">
    <input @click="HelloWorld" type="button" value="HelloWorld">
  </div>
</template>

<script>

export default {
  name: 'App',
  methods: {
      HelloWorld() {
        this.axios.get('http://localhost:8080/hello')
          .then((response) => {
            alert(response.data);
          })
          .catch((e) => {
            alert(e);
          });
      }
    }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
