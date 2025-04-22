import { Outlet, useLocation, useNavigate } from 'react-router';
import {
  AppLayout,
  Avatar,
  Icon,
  MenuBar,
  MenuBarItemSelectedEvent,
  ProgressBar,
  Scroller,
  SideNav,
  SideNavItem,
} from '@vaadin/react-components';
import { Suspense } from 'react';
import { createMenuItems } from '@vaadin/hilla-file-router/runtime.js';

import { Link } from 'react-router';
import LogoImg from './img/KMUTT_Logo.jpg';

function Header() {
  // TODO Replace with real application logo and name
  return (
    <div className="flex p-m gap-m items-center" slot="drawer">
      <Link to="/">
        <img src={LogoImg} className="text-primary icon-l" />
      </Link>
      <Link to="/">
        <span className="font-bold text-xl">MOD MAP</span>
      </Link>
    </div>
  );
}

function MainMenu() {
  const navigate = useNavigate();
  const location = useLocation();

  return (
    <SideNav className="mx-m" onNavigate={({ path }) => path != null && navigate(path)} location={location}>
      {createMenuItems().map(({ to, icon, title }) => (
        <SideNavItem path={to} key={to}>
          {icon && <Icon icon={icon} slot="prefix" />}
          {title}
        </SideNavItem>
      ))}
    </SideNav>
  );
}

function UserMenu() {
  // TODO Replace with real user information and actions
  const items = [
    {
      component: (
        <>
          <Avatar theme="xsmall" name="Jetanin Naitho" colorIndex={5} className="mr-s" /> John Smith
        </>
      ),
      children: [
        { text: 'View Profile', action: () => console.log('View Profile') },
        { text: 'Manage Settings', action: () => console.log('Manage Settings') },
        { text: 'Logout', action: () => console.log('Logout') },
      ],
    },
  ];
  const onItemSelected = (event: MenuBarItemSelectedEvent) => {
    const action = (event.detail.value as any).action;
    if (action) {
      action();
    }
  };
  return (
    <MenuBar theme="tertiary-inline" items={items} onItemSelected={onItemSelected} className="m-m" slot="drawer" />
  );
}

export default function MainLayout() {
  return (
    <AppLayout primarySection="drawer" onClick={(e) => {
      
}}>
      <Header />
      <Scroller slot="drawer">
        <MainMenu />
      </Scroller>
      <UserMenu />
      <Suspense fallback={<ProgressBar indeterminate={true} className="m-0" />}>
        <Outlet />
      </Suspense>
    </AppLayout>
  );
}
