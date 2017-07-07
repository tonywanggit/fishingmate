Page({
  data: {
  },
  onReady: function (e) {
    this.initMap();
    this.setCurPostion();
  },

  regionchange(e) {
    console.log(e.type)
  },

  markertap(e) {
    console.log(e.markerId)
  },

  controltap(e) {
    if (e.controlId == 1){
      this.setCurPostion();
    }else if(e.controlId == 2){
      this.getLngLat();
    }

  },

  initMap: function () {
    // 使用 wx.createMapContext 获取 map 上下文
    this.mapCtx = wx.createMapContext('map');
    var _this = this;
    wx.getSystemInfo({
      success: function (res) {
        _this.setData({
          map_width: res.windowWidth,
          map_height: res.windowHeight,
          controls: [{
            id: 1,
            iconPath: '/images/map_position.png',
            position: {
              left: 10,
              top: res.windowHeight - 50,
              width: 32,
              height: 32
            },
            clickable: true
          },{
            id: 2,
            iconPath: '/images/map_curpos.png',
            position: {
              left: res.windowWidth / 2 - 16,
              top: res.windowHeight / 2 - 30,
              width: 32,
              height: 32
            },
            clickable: true
          }]

        })
      }
    })
  },

  setCurPostion:function(){
    var _this = this;
    wx.getLocation({
      type: 'gcj02', //返回可以用于wx.openLocation的经纬
      success: function (res) {
        _this.setData({
          latitude: res.latitude,
          longitude: res.longitude
        })
      }
    });
  },

  getLngLat: function () {
    var that = this;
    this.mapCtx.getCenterLocation({
      success: function (res) {


        wx.showToast({
          title: "经度：" + res.longitude + ", 纬度：" + res.latitude,
          icon: 'success',
          duration: 2000
        });
        

      }
    })
  }

})