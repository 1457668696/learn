<template>
  <el-row>

    <!--    网格布局左8-->
    <el-col :span="8" style="padding-right: 13px">
      <div class="grid-content bg-purple">
        <!--    卡片-->
        <el-card class="box-card">

          <div class="user">
            <img src="../assets/images/user.png" alt="">
            <div class="userInfo">
              <p class="name">Admin</p>
              <p class="access">超级管理员</p>
            </div>
          </div>
          <div class="login">
            <p>上次登录时间：<span>2023.2.3</span></p>
            <p>上次登录地点：<span>贵州</span></p>
          </div>
        </el-card>

        <!--      表格-卡片嵌套-->
        <el-card style="margin-top: 30px;height: 460px">

          <el-table :data="tableData">
            <el-table-column v-for="(val,key) in tableLabel" :prop="key" :label="val" :key="key"></el-table-column>
          </el-table>

        </el-card>
      </div>
    </el-col>


    <!--    网格布局右16-->
    <el-col :span="16">
      <div class="num">
        <el-card v-for="item in countData" :key="item.name"
                 :body-style="{display:'flex',padding:0}"
        >
          <i class="icon" :class="`el-icon-${item.icon}`"
             :style="{background:item.color}"></i>
          <div class="detail">
            <p class="price">￥{{ item.value }}</p>
            <p class="text">{{ item.name }}</p>
          </div>
        </el-card>
      </div>




      <!--  折线图-->
      <el-card style="height: 292px">
        <div ref="echarts1" style="height: 280px"></div>
      </el-card>

      <!--  柱状饼图-->
      <div class="graph">
        <el-card style="height: 260px">
          <div ref="echarts2" style="height: 260px"></div>
        </el-card>
        <el-card style="height: 260px">
          <div ref="echarts3" style="height: 260px"></div>
        </el-card>
      </div>
    </el-col>





  </el-row>
</template>

<script>
import {getData} from "@/api";
import * as echarts from 'echarts'

export default {
  data() {
    return {
      countData: [
        {
          name: "今日支付订单",
          value: 1234,
          icon: "success",
          color: "#2ec7c9",
        },
        {
          name: "今日收藏订单",
          value: 210,
          icon: "star-on",
          color: "#ffb980",
        },
        {
          name: "今日未支付订单",
          value: 1234,
          icon: "s-goods",
          color: "#5ab1ef",
        },
        {
          name: "本月支付订单",
          value: 1234,
          icon: "success",
          color: "#2ec7c9",
        },
        {
          name: "本月收藏订单",
          value: 210,
          icon: "star-on",
          color: "#ffb980",
        },
        {
          name: "本月未支付订单",
          value: 1234,
          icon: "s-goods",
          color: "#5ab1ef",
        },
      ],
      tableData: [],
      tableLabel: {
        name: '课程',
        todayBuy: '今日购买',
        monthBuy: '本月购买',
        totalBuy: '总购买'
      }
    }
  },
  mounted() {
    getData().then(({data}) => {
      const {tableData} = data.data;
      this.tableData = tableData;  /*这里就是箭头函数的用法了，this一直向外寻找到vue实例*/


      // 基于准备好的dom，初始化echarts实例
      const echarts1 = echarts.init(this.$refs.echarts1)
      // 指定图表的配置项和数据
      var echarts1Option = {}
      // 处理数据xAxis
      const { orderData, userData, videoData } = data.data
      const xAxis = Object.keys(orderData.data[0])
      const xAxisData = {
        data: xAxis
      }
      echarts1Option.xAxis = xAxisData
      echarts1Option.yAxis = {}
      echarts1Option.legend = xAxisData
      echarts1Option.series = []
      xAxis.forEach(key => {
        echarts1Option.series.push({
          name: key,
          data: orderData.data.map(item => item[key]),
          type: 'line'
        })
      })
      console.log(echarts1Option)
      // 使用刚指定的配置项和数据显示图表。
      echarts1.setOption(echarts1Option)


      //柱状图
      const echarts2 = echarts.init(this.$refs.echarts2)
      const eachrts2Option = {
        legend: {
          // 图例文字颜色
          textStyle: {
            color: "#333",
          },
        },
        grid: {
          left: "20%",
        },
        // 提示框
        tooltip: {
          trigger: "axis",
        },
        xAxis: {
          type: "category", // 类目轴
          data: userData.map(item => item.date),
          axisLine: {
            lineStyle: {
              color: "#17b3a3",
            },
          },
          axisLabel: {
            interval: 0,
            color: "#333",
          },
        },
        yAxis: [
          {
            type: "value",
            axisLine: {
              lineStyle: {
                color: "#17b3a3",
              },
            },
          },
        ],
        color: ["#2ec7c9", "#b6a2de"],
        series: [
          {
            name: '新增用户',
            data: userData.map(item => item.new),
            type: 'bar'
          },
          {
            name: '活跃用户',
            data: userData.map(item => item.active),
            type: 'bar'
          }
        ],
      }
      echarts2.setOption(eachrts2Option)

      // 饼状图
      const echarts3 = echarts.init(this.$refs.echarts3)
      const eachrts3Option = {
        tooltip: {
          trigger: "item",
        },
        color: [
          "#0f78f4",
          "#dd536b",
          "#9462e5",
          "#a6a6a6",
          "#e1bb22",
          "#39c362",
          "#3ed1cf",
        ],
        series: [
          {
            data: videoData,
            type: 'pie'
          }
        ],
      }
      echarts3.setOption(eachrts3Option)


    }
)
  }
}
</script>

<style lang="less" scoped>
.user {
  padding-bottom: 20px;
  margin-bottom: 20px;
  border-bottom: 1px solid #999999;
  display: flex;
  align-items: center;

  img {
    margin-right: 40px;
    width: 150px;
    height: 150px;
    border-radius: 50%;
  }

  .userInfo {
    .name {
      font-size: 32px;
      margin-top: 10px;
    }

    .access {
      color: #999999;
    }
  }

}

.login {
  p {
    line-height: 28px;
    font-size: 14px;
    color: #999999;

    span {
      color: #666666;
      margin-left: 60px;
    }
  }
}

.num {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;

  .icon {
    width: 80px;
    height: 80px;
    font-size: 30px;
    text-align: center;
    line-height: 80px;
    color: white;
  }

  .detail {
    display: flex;
    flex-direction: column;
    justify-content: center;
    margin-left: 15px;

    //价格
    .price {
      font-size: 30px;
      margin-bottom: 10px;
      line-height: 30px;
      height: 30px;
    }

    //文字
    .text {
      color: #999999;
      font-size: 14px;
      text-align: center;
    }
  }

  //自动掉落
  .el-card {
    width: 32%;
    margin-bottom: 20px;
  }
}

.graph {
  display: flex;
  justify-content: space-between;
  margin-top: 20px;

  .el-card {
    width: 48%;
  }
}


</style>