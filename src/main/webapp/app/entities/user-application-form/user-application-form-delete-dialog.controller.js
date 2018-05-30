(function() {
    'use strict';

    angular
        .module('sudeApp')
        .controller('UserApplicationFormDeleteController',UserApplicationFormDeleteController);

    UserApplicationFormDeleteController.$inject = ['$uibModalInstance', 'entity', 'UserApplicationForm'];

    function UserApplicationFormDeleteController($uibModalInstance, entity, UserApplicationForm) {
        var vm = this;

        vm.userApplicationForm = entity;
        vm.clear = clear;
        vm.confirmDelete = confirmDelete;
        
        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function confirmDelete (id) {
            UserApplicationForm.delete({id: id},
                function () {
                    $uibModalInstance.close(true);
                });
        }
    }
})();
