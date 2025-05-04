import React from 'react';
import { TransformWrapper, TransformComponent } from 'react-zoom-pan-pinch';
import SvgComponent from './Svg';

const ZoomableImage: React.FC = () => {
  return (
    <div style={{ width: '100%', height: '100vh' }}>
      <TransformWrapper
        initialScale={1}
        minScale={0.5}
        maxScale={5}
        wheel={{ step: 0.1 }}
        doubleClick={{ disabled: true }}
        pinch={{ step: 5 }}
      >
        {({ zoomIn, zoomOut, resetTransform }) => (
          <>
            <div style={{ marginBottom: 10 }}>
              <button onClick={() => zoomIn()}>Zoom In</button>
              <button onClick={() => zoomOut()}>Zoom Out</button>
              <button onClick={() => resetTransform()}>Reset</button>
            </div>
            <TransformComponent>
                <SvgComponent/>
            </TransformComponent>
          </>
        )}
      </TransformWrapper>
    </div>
  );
};

export default ZoomableImage;
