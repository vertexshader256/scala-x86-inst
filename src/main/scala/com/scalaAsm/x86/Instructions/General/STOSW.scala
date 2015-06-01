package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store String
// Category: general/datamovstring

trait STOSW extends InstructionDefinition {
  val mnemonic = "STOSW"
}

object STOSW extends ZeroOperands[STOSW] with STOSWImpl

trait STOSWImpl extends STOSW {
  implicit object STOSW_0 extends _0 {
    val opcode: OneOpcode = 0xAB
        override def hasImplicitOperand = true
  }
}
