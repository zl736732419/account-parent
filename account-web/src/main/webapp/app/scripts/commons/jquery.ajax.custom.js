/**
 * ajax工具
 * Created by zhenglian on 2017/6/26.
 */
(function ($) {
    $.ajaxwrapper = {
        doAjax: function(settings) {
            var config = {
                cache: false,
                error: function (xhr, error, target) {
                    console.error(error);
                    throw new Error("ajax错误");
                }
            };
            
            $.extend(true, config,  settings);
            config.success = function (data) {
                settings.callback && settings.callback(data);
            }
            
            $.ajax(config)
        },
        /**
         * 提交表单请求
         * @param url
         * @param data
         * @param callback
         */
        postForm: function (url, data, callback) {
            var settings = {
                async: false,
                dataType: 'json',
                type: 'post',
                url: url, 
                data: data,
                contentType: 'application/x-www-form-urlencoded'
            };
            this.doAjax(settings, callback);
        },
        /**
         * 提交json
         * @param url
         * @param data
         * @param callback
         */
        postJson: function (url, data, callback) {
            var settings = {
                async: false,
                dataType: 'json',
                type: 'post',
                url: url,
                data: data,
                contentType: 'application/json'
            };
            this.doAjax(settings, callback);
        }
    };
})(jQuery);
