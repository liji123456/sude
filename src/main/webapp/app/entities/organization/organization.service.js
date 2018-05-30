(function() {
    'use strict';
    angular
        .module('sudeApp')
        .factory('Organization', Organization);

    Organization.$inject = ['$resource', 'DateUtils'];

    function Organization ($resource, DateUtils) {
        var resourceUrl =  'api/organizations/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                        data.createDate = DateUtils.convertDateTimeFromServer(data.createDate);
                    }
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    }
})();
