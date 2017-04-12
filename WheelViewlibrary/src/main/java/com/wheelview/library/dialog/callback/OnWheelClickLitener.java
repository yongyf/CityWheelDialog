package com.wheelview.library.dialog.callback;

import com.wheelview.library.dialog.entity.Address;

/**
 * @desc：
 * @author: yongzhi
 * @time: 2017/4/11 0011
 * @reviser_and_time:
 */

public interface OnWheelClickLitener {

    void onOkClick(Address address);

    void onCancelClick();
}
