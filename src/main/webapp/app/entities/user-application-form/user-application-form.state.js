(function() {
    'use strict';

    angular
        .module('sudeApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider
        .state('user-application-form', {
            parent: 'entity',
            url: '/user-application-form?page&sort&search',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'sudeApp.userApplicationForm.home.title'
            },
            views: {
                'content@': {
                    templateUrl: 'app/entities/user-application-form/user-application-forms.html',
                    controller: 'UserApplicationFormController',
                    controllerAs: 'vm'
                }
            },
            params: {
                page: {
                    value: '1',
                    squash: true
                },
                sort: {
                	value: 'createdDate,desc',
                    squash: true
                },
                search: null
            },
            resolve: {
                pagingParams: ['$stateParams', 'PaginationUtil', function ($stateParams, PaginationUtil) {
                    return {
                        page: PaginationUtil.parsePage($stateParams.page),
                        sort: $stateParams.sort,
                        predicate: PaginationUtil.parsePredicate($stateParams.sort),
                        ascending: PaginationUtil.parseAscending($stateParams.sort),
                        search: $stateParams.search
                    };
                }],
                translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                    $translatePartialLoader.addPart('userApplicationForm');
                    $translatePartialLoader.addPart('global');
                    return $translate.refresh();
                }]
            }
        })
        .state('user-application-form-detail', {
            parent: 'entity',
            url: '/user-application-form/{id}',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'sudeApp.userApplicationForm.detail.title'
            },
            views: {
                'content@': {
                    templateUrl: 'app/entities/user-application-form/user-application-form-detail.html',
                    controller: 'UserApplicationFormDetailController',
                    controllerAs: 'vm'
                }
            },
            resolve: {
                translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                    $translatePartialLoader.addPart('userApplicationForm');
                    return $translate.refresh();
                }],
                entity: ['$stateParams', 'UserApplicationForm', function($stateParams, UserApplicationForm) {
                    return UserApplicationForm.get({id : $stateParams.id}).$promise;
                }],
                previousState: ["$state", function ($state) {
                    var currentStateData = {
                        name: $state.current.name || 'user-application-form',
                        params: $state.params,
                        url: $state.href($state.current.name, $state.params)
                    };
                    return currentStateData;
                }]
            }
        })
        .state('user-application-form-detail.edit', {
            parent: 'user-application-form-detail',
            url: '/detail/edit',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/user-application-form/user-application-form-dialog.html',
                    controller: 'UserApplicationFormDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: ['UserApplicationForm', function(UserApplicationForm) {
                            return UserApplicationForm.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('^', {}, { reload: false });
                }, function() {
                    $state.go('^');
                });
            }]
        })
        .state('user-application-form.new', {
            parent: 'user-application-form',
            url: '/new',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/user-application-form/user-application-form-dialog.html',
                    controller: 'UserApplicationFormDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: function () {
                            return {
                                appFormCode: null,
                                status: null,
                                pay_premium: null,
                                startDate: null,
                                endDate: null,
                                insuranceNo: null,
                                id: null
                            };
                        }
                    }
                }).result.then(function() {
                    $state.go('user-application-form', null, { reload: 'user-application-form' });
                }, function() {
                    $state.go('user-application-form');
                });
            }]
        })
        .state('user-application-form.edit', {
            parent: 'user-application-form',
            url: '/{id}/edit',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/user-application-form/user-application-form-dialog.html',
                    controller: 'UserApplicationFormDialogController',
                    controllerAs: 'vm',
                    backdrop: 'static',
                    size: 'lg',
                    resolve: {
                        entity: ['UserApplicationForm', function(UserApplicationForm) {
                            return UserApplicationForm.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('user-application-form', null, { reload: 'user-application-form' });
                }, function() {
                    $state.go('^');
                });
            }]
        })
        .state('user-application-form.delete', {
            parent: 'user-application-form',
            url: '/{id}/delete',
            data: {
                authorities: ['ROLE_USER']
            },
            onEnter: ['$stateParams', '$state', '$uibModal', function($stateParams, $state, $uibModal) {
                $uibModal.open({
                    templateUrl: 'app/entities/user-application-form/user-application-form-delete-dialog.html',
                    controller: 'UserApplicationFormDeleteController',
                    controllerAs: 'vm',
                    size: 'md',
                    resolve: {
                        entity: ['UserApplicationForm', function(UserApplicationForm) {
                            return UserApplicationForm.get({id : $stateParams.id}).$promise;
                        }]
                    }
                }).result.then(function() {
                    $state.go('user-application-form', null, { reload: 'user-application-form' });
                }, function() {
                    $state.go('^');
                });
            }]
        });
    }

})();
