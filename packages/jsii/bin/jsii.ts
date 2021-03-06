#!/usr/bin/env node
import * as yargs from 'yargs';
import { bundle } from '../lib/bundle';
import { VERSION } from '../lib/version';
import { watch } from '../lib/watch';

process.on('unhandledRejection', err => {
    // tslint:disable-next-line:no-console
    console.error(err.stack);
    process.exit(1);
});

async function main(dir: string, args: any) {
    if (args.watch) {
        return await watch(dir);
    }

    return await bundle(dir);
}

const argv = yargs
    .usage('Usage: jsii [options]')
    .option('watch', { alias: 'w', desc: 'alias for tsc --watch (tsconfig.json will be created)' })
    .version(VERSION)
    .argv;

main(process.cwd(), argv).catch(err => {
    process.stderr.write(err.stack + '\n');
    process.exit(1);
});
