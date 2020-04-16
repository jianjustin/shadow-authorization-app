/**
 * Define all of your application routes here
 * for more information on routes, see the
 * official documentation https://router.vuejs.org/en/
 */
import store from '../store'
export default [
  {
    path: '*',
    meta: {
      name: '',
      requiresAuth: true
    },
    redirect: {
      path: '/dashboard'
    }
  },
  // This  allows you to have pages apart of the app but no rendered inside the dash
  {
    path: '/',
    meta: {
      name: '',
      requiresAuth: false
    },
    component: resolve => require([`@/views/LoginHome.vue`], resolve),
    // redirect if already signed in
    beforeEnter: (to, from, next) => {
      if (store.getters.authorized) {
        next('/dashboard')
      } else {
        next()
      }
    },
    children: [
      {
        path: '',
        component: resolve => require([`@/components/LoginForm.vue`], resolve)
      }
    ]
  },
  // add any extra routes that you want rendered in the dashboard as a child below. Change toolbar names here
  {
    path: '/dashboard',
    meta: {
      name: 'Dashboard View',
      requiresAuth: true
    },
    component: resolve => require([`@/views/DashboardView.vue`], resolve),
    children: [
      {
        path: '',
        name: 'Dashboard',
        component: resolve => require([`@/components/DashViews/Dashboard.vue`], resolve)
      },
      {
        path: 'user-profile',
        meta: {
          name: 'User Profile',
          requiresAuth: true
        },
        component: resolve => require([`@/components/DashViews/UserProfile.vue`], resolve)
      },
      {
        path: 'table-list',
        meta: {
          name: 'Table List',
          requiresAuth: true
        },
        component: resolve => require([`@/components/DashViews/SimpleTables.vue`], resolve)
      },
      {
        path: 'user-tables',
        meta: {
          name: 'User Table',
          requiresAuth: true
        },
        component: resolve => require([`@/components/DashViews/UsersTable.vue`], resolve)
      },
      {
        path: 'tablestest',
        meta: {
          name: 'Complex Tables test',
          requiresAuth: true
        },
        component: resolve => require([`@/components/DashViews/TableList.vue`], resolve)
      },
      {
        path: 'typography',
        meta: {
          name: 'Typography',
          requiresAuth: true
        },
        component: resolve => require([`@/components/DashViews/Typography.vue`], resolve)
      },
      {
        path: 'icons',
        meta: {
          name: 'Icons',
          requiresAuth: true
        },
        component: resolve => require([`@/components/DashViews/Icons.vue`], resolve)
      },
      {
        path: 'maps',
        meta: {
          name: 'Maps',
          requiresAuth: true
        },
        component: resolve => require([`@/components/DashViews/Maps.vue`], resolve)
      },
      {
        path: 'notifications',
        meta: {
          name: 'Notifications',
          requiresAuth: true
        },
        component: resolve => require([`@/components/DashViews/Notifications.vue`], resolve)
      }
    ]
  }
]
