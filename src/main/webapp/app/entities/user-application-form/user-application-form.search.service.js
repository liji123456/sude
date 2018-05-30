(function() {
    'use strict';

    angular
        .module('sudeApp')
        .factory('UserApplicationFormSearch', UserApplicationFormSearch);

    UserApplicationFormSearch.$inject = ['$resource'];

    function UserApplicationFormSearch($resource) {
        var resourceUrl =  'api/_search/user-application-forms/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true}
        });
    }
})();
