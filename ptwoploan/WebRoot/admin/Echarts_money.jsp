<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript" src="../js/jquery-1.11.0.js"></script>
  <script src="https://cdn.bootcss.com/echarts/4.2.0-rc.2/echarts-en.common.js"></script>

  </head>
  <body>
       <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
 	<div align="center">
    <div id="main" style="width: 600px;height:400px;" ></div>
    </div>
    
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
// 显示标题，图例和空的坐标轴
myChart.setOption({
	 color: ['#3398DB'],
    title: {
        text: '借款投资金额（￥）'
    },
    tooltip: {},
    legend: {
        data:['金额（￥）']
    },
    xAxis: {
        data: []
    },
    yAxis: {},
    series: [{
        name: '金额（￥）',
        type: 'bar',
        data: []
    }]
});
		
      myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画

     var names=[];    //类别数组（实际用来盛放X轴坐标值）
     var nums=[];    //销量数组（实际用来盛放Y坐标值）

     $.ajax({
    	 type : "post",
         async : false,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
         url : "/ptwoploan/Echart_QueryAllMoneyServlet",    //请求发送到TestServlet处
         data : {},
         dataType : "json",        //返回数据形式为json
         success : function(result) {
        	 
        	//请求成功时执行该函数内容，result即为服务器返回的json对象
             if (result) {
                    
            	 for(var i=0;i<result.length;i++){       
                       names.push(result[i].name);    //挨个取出类别并填入类别数组
                     }
                   
            	 for(var i=0;i<result.length;i++){       
                        nums.push(result[i].number);    //挨个取出销量并填入销量数组
                      }
                   
            	 myChart.hideLoading();    //隐藏加载动画
                   
            	 myChart.setOption({        //加载数据图表
                       
            		 xAxis: {
            			 
                            data: names
                            
                        },
                        series: [{
                            // 根据名字对应到相应的系列
                            name: '金额（￥）',
                            data: nums
                        }]
            	 });
             }
         } 
     });

    </script> 
  </body>
</html>
