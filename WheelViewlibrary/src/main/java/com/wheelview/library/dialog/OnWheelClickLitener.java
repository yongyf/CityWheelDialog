package com.wheelview.library.dialog;

/**
 * @desc：
 * @author: yongzhi
 * @time: 2017/4/11 0011
 * @reviser_and_time:
 */

public interface OnWheelClickLitener {
    /**
     * @param provinceName 省、自治区名称
     * @param provinceID   省id
     * @param cityName     城市名称
     * @param cityID       城市id
     * @param countryName  城区、县名称
     * @param countryID    城区、县id
     */
    void onOKClick(String provinceName, String provinceID, String cityName, String cityID, String countryName, String countryID);

    void onCancelClick();
}
