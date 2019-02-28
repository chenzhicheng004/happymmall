var webpack = require('webpack');
var ExtractTextPlugin = require('extract-text-webpack-plugin');
var HtmlWebpackPlugin = require('html-webpack-plugin');
var WEBPACK_ENV = process.env.WEBPACK_ENV || 'dev';
console.log(WEBPACK_ENV);
var getHtmlConfig = function (name, title) {
    return {
        template: './src/view/' + name + '.html',
        filename: 'view/' + name + '.html',
        favicon: './favicon.ico',
        title: title,
        inject: true,
        hash: true,
        chunks: ['common', name]
    };
};

var configs = {
    entry: {
        'index': ['./src/page/index/index.js'],
        'login': ['./src/page/login/index.js'],
        'common': ['./src/page/common/index.js']
    },
    output: {
        path: __dirname + '/dist',
        publicPath: __dirname + '/dist',
        filename: 'js/[name].js',
    },
    externals: {
        'jquery': 'window.jQuery'
    },
    devServer: {
        inline:true,
        hot:true
    } ,
    module: {
        rules: [
            {
                test: /\.(gif|png|jpg|woff|svg|eot|ttf)\??.*$/,
                use: [
                    {
                        loader: 'file-loader',
                        options: {
                            name: 'resource/[name].[ext]',
                        }
                    }
                ]
            },
            {
                test: /\.css$/,
                use: ExtractTextPlugin.extract({
                    fallback: "style-loader",
                    use: "css-loader"
                })
            }
        ]
    },
    plugins: [
        new ExtractTextPlugin("css/[name].css"),
        new HtmlWebpackPlugin(getHtmlConfig('index', '首页')),
        new HtmlWebpackPlugin(getHtmlConfig('login', '登录'))
    ],
    // optimization: {
    //     splitChunks: {
    //         cacheGroups: {
    //             commons: {
    //                 name: "base",
    //                 chunks: "initial",
    //                 minChunks: 2,
    //             }
    //         }
    //     }
    // }
};

if (WEBPACK_ENV === 'dev') {
    configs.entry.common.push('webpack-dev-server/client?http://localhost:8080');
    console.log(configs.entry.common)
}

module.exports = configs;