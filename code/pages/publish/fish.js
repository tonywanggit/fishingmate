// pages/publish/fish.js
var server = require('../../utils/server.js');
var util = require('../../utils/util.js');

Page({
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
   
    server.postToServer("api/fishingmap/create", data);
  },
  formReset: function () {
    console.log('form发生了reset事件')
  }
})