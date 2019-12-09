<template>
  <div id="table">
    <div style="width: 50%;">
      <Table :columns="columns1" :data="data1"></Table>
    </div>
  </div>

</template>

<script>
import axios from 'axios'
export default {
    name: "table",
    data () {
      return {
        columns1: [
          {title: '用户名', key: 'userName'},
          {title: '年龄', key: 'age'},
          {title: '性别', key: 'gender'}
        ],
        data1: []
      }
    },
    mounted () {
      axios
        .get('http://127.0.0.1:8081/findList')
        .then(response => {
          debugger;
          this.data1 = response.data
        })
    }
}
</script>

<style scoped>

</style>
