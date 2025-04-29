declare module "*.jpg" {
    const value: string;
    export default value;
}

declare module "./SVJ.jsx"{
    const SvgIcon: React.FC<React.SVGProps<SVGSVGElement>>;
    export { SvgIcon };
}