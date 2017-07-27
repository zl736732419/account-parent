/**
 * Created by zhenglian on 2017/6/25.
 */
jQuery.validator.addMethod("telephone", function(value, element) {
    var pattern = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
    return this.optional(element) || (value.length == 11 && pattern.test(value));
}, $.validator.format("手机号格式错误!"));