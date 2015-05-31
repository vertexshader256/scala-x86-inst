package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert Doubleword to Quadword
// Category: general/conver

trait CDQ extends InstructionDefinition {
  val mnemonic = "CDQ"
}

object CDQ extends ZeroOperands[CDQ] with CDQImpl

trait CDQImpl extends CDQ {
  implicit object CDQ_0 extends _0 {
    val opcode: OneOpcode = 0x99
        override def hasImplicitOperand = true
  }
}
