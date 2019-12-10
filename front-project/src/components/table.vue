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
  name: 'table',
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
      .get('/user/findList')
      .then(response => {
        this.data1 = response.data
        this.data1.forEach(function (value) {
          if (value.gender === 0) value.gender = '男'
          else value.gender = '女'
        })
      })
  }
}
</script>

<style scoped>

</style>
