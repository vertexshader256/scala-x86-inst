package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Check pending unmasked floating-point exceptions
// Category: general/control

trait WAIT extends InstructionDefinition {
  val mnemonic = "WAIT"
}

object WAIT extends ZeroOperands[WAIT] with WAITImpl

trait WAITImpl extends WAIT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9B
      }
}
