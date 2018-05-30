(function() {
    'use strict';

    angular
        .module('sudeApp')
        .controller('UserApplicationFormDetailController', UserApplicationFormDetailController);

    UserApplicationFormDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'UserApplicationForm', 'Organization'];

    function UserApplicationFormDetailController($scope, $rootScope, $stateParams, previousState, entity, UserApplicationForm, Organization) {
        var vm = this;

        vm.userApplicationForm = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('sudeApp:userApplicationFormUpdate', function(event, result) {
            vm.userApplicationForm = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
