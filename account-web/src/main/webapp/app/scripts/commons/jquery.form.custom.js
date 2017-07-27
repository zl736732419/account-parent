/**
 * 表单值序列化
 * 处理简单域
 * Created by zhenglian on 2017/6/26.
 */
(function ($) {
    $.fn.serializeForm = function () {
        var $form = $(this);
        var arr = $form.serializeArray();
        var data = {};
        $(arr).each(function (index, item) {
            if (data[item.name] != undefined) {
                throw new Error("表单存在元素重复name:" + item.name);
            }
            data[item.name] = item.value
        });

        return data;
    };
})(jQuery);


