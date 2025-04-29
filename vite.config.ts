import { UserConfigFn } from 'vite';
import { overrideVaadinConfig } from './vite.generated';
import tailwindcss from '@tailwindcss/vite'

const customConfig: UserConfigFn = (env) => ({
  // Here you can add custom Vite parameters
  // https://vitejs.dev/config/
  plugins: [
    tailwindcss(),
  ]
});

export default overrideVaadinConfig(customConfig);

// const customConfig = {
//   plugins: [
//     tailwindcss(), // Add Tailwind CSS plugin
//   ],
// };

// export default overrideVaadinConfig(() => defineConfig(customConfig));