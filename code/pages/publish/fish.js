// pages/publish/fish.js
var server = require('../../utils/server.js');
var util = require('../../utils/util.js');

Page({
  data: {
    showShareButton: false,
    showSaveButton: true,
  },
  onShareAppMessage: function (res) {
    if (res.from === 'button') {
      // 来自页面内转发按钮
      console.log(res.target)
    }
    return {
      title: '战报：Tony 2017-07-18 上鱼',
      path: '/pages/publish/fish',
      success: function (res) {
        // 转发成功
      },
      fail: function (res) {
        // 转发失败
      }
    }
  },

  formSubmit: function (e) {
    console.log('form发生了submit事件，携带数据为：', e.detail.value);

    var data = {
      "userId": 10,
      "fishingMapType": 1,
      "fishingType": 1,
      "desc": "大败黄军",
      "longitude": 30,
      "latitude": 30
    };
    this.showModel();
   
    server.postToServer("api/fishingmap/create", data);

  },
  
  formReset: function () {
    console.log('form发生了reset事件')
  },

  bindDateChange: function (e) {
    console.log('picker发送选择改变，携带值为', e.detail.value)
    this.setData({
      fishingDate: e.detail.value
    })
  },

  showModel: function(){
    var that = this;
    wx.showToast({
      title: '发布成功',
      icon: 'success',
      duration: 2000,
      complete: function (res) {
        that.setData({
          showShareButton: true,
          showSaveButton: false
        });
      }
    })
  }
})