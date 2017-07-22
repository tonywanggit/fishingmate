// pages/report/index.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    distance: ["1km", "3km", "5km", "10km", "全城"],
    distanceIndex: 1,

    fishmapType: ["所有战报", "只看上鱼", "只看空军", "只看放杆"],
    fishmapTypeIndex: 0,

    orderBy: ["距离优先", "时间优先"],
    orderByIndex: 0

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },

  bindDistanceChange: function (e) {
    console.log('distance 发生选择改变，携带值为', e.detail.value);

    this.setData({
      distanceIndex: e.detail.value
    })
  },

  bindFishingmapTypeChange: function (e) {
    console.log('fishingmap type 发生选择改变，携带值为', e.detail.value);

    this.setData({
      fishmapTypeIndex: e.detail.value
    })
  },

  bindOrderByChange: function (e) {
    console.log('orderBy 发生选择改变，携带值为', e.detail.value);

    this.setData({
      orderByIndex: e.detail.value
    })
  }
})