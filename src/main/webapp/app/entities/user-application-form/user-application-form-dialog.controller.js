(function() {
    'use strict';

    angular
        .module('sudeApp')
        .controller('UserApplicationFormDialogController', UserApplicationFormDialogController);

    UserApplicationFormDialogController.$inject = ['$timeout', '$scope', '$stateParams', '$uibModalInstance', 'entity', 'UserApplicationForm', 'Organization'];

    function UserApplicationFormDialogController ($timeout, $scope, $stateParams, $uibModalInstance, entity, UserApplicationForm, Organization) {
        var vm = this;

        vm.userApplicationForm = entity;
        vm.clear = clear;
        vm.datePickerOpenStatus = {};
        vm.openCalendar = openCalendar;
        vm.save = save;
        vm.organizations = Organization.query();

        $timeout(function (){
            angular.element('.form-group:eq(1)>input').focus();
        });

        function clear () {
            $uibModalInstance.dismiss('cancel');
        }

        function save () {
            vm.isSaving = true;
            if (vm.userApplicationForm.id !== null) {
                UserApplicationForm.update(vm.userApplicationForm, onSaveSuccess, onSaveError);
            } else {
                UserApplicationForm.save(vm.userApplicationForm, onSaveSuccess, onSaveError);
            }
        }

        function onSaveSuccess (result) {
            $scope.$emit('sudeApp:userApplicationFormUpdate', result);
            $uibModalInstance.close(result);
            vm.isSaving = false;
        }

        function onSaveError () {
            vm.isSaving = false;
        }

        vm.datePickerOpenStatus.startDate = false;
        vm.datePickerOpenStatus.endDate = false;

        function openCalendar (date) {
            vm.datePickerOpenStatus[date] = true;
        }
    }
})();
