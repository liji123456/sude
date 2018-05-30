(function() {
    'use strict';
    angular
        .module('sudeApp')
        .factory('UserApplicationForm', UserApplicationForm);

    UserApplicationForm.$inject = ['$resource', 'DateUtils'];

    function UserApplicationForm ($resource, DateUtils) {
        var resourceUrl =  'api/user-application-forms/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                        data.startDate = DateUtils.convertDateTimeFromServer(data.startDate);
                        data.endDate = DateUtils.convertLocalDateFromServer(data.endDate);
                    }
                    return data;
                }
            },
            'update': {
                method: 'PUT',
                transformRequest: function (data) {
                    var copy = angular.copy(data);
                    copy.endDate = DateUtils.convertLocalDateToServer(copy.endDate);
                    return angular.toJson(copy);
                }
            },
            'save': {
                method: 'POST',
                transformRequest: function (data) {
                    var copy = angular.copy(data);
                    copy.endDate = DateUtils.convertLocalDateToServer(copy.endDate);
                    return angular.toJson(copy);
                }
            }
        });
    }
})();
