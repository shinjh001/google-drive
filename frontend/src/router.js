
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import IndexingIndexManager from "./components/listers/IndexingIndexCards"
import IndexingIndexDetail from "./components/listers/IndexingIndexDetail"

import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import NotificationNotifyManager from "./components/listers/NotificationNotifyCards"
import NotificationNotifyDetail from "./components/listers/NotificationNotifyDetail"
import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/indexings/indices',
                name: 'IndexingIndexManager',
                component: IndexingIndexManager
            },
            {
                path: '/indexings/indices/:id',
                name: 'IndexingIndexDetail',
                component: IndexingIndexDetail
            },

            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/notifications/notifies',
                name: 'NotificationNotifyManager',
                component: NotificationNotifyManager
            },
            {
                path: '/notifications/notifies/:id',
                name: 'NotificationNotifyDetail',
                component: NotificationNotifyDetail
            },
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },




    ]
})
