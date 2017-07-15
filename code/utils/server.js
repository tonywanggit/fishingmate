// 和后台交互
var SERVER_BASE = 'https://fishing.5151pic.com/';

// 发送POST数据到服务端
function postToServer(api, data, sCallback, fCallback){
  wx.request({
    method: "POST",
    url: SERVER_BASE + api, //仅为示例，并非真实的接口地址
    header: {
      'content-type': 'application/json'
    },
    data: data,
    success: function (res) {
      console.log(res.data);
    }
  });
}

module.exports = {
  postToServer: postToServer
}
